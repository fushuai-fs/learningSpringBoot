
## Mysql 参数优化建议
设置default-storage-engine=InnoDB，不建议使用MyISAM引擎

innodb_buffer_pool_size的大小，如果是单实例且绝大多书是InnoDB引擎表的话，可考虑设置为物理内存的50%-70%左右。

设置innodb_file_per_table=1，使用独立表空间。

调整innodb_data_file_path=ibddata1:1G:autoextend， 不要用默认的10M在高并发场景下，性能会有很大提升。

设置innodb_log_file_size=256M, 设置innodb_log_files_in_group=2， 基本可以满足大多数应用场景。

调整max_connection（最大连接数）
max_connection_error（最大错误数）

open_file_limit 、 innodb_open_files 、 table_open_cache 、 table_definition_cache
可以设置大约为max_connection的10倍左右大小。

key_buffer_size 建议调小，32M左右即可，另外建议关闭querycache.

mp_table_size 和 max_heap_table_size 设置不要过大，另外sort_buffer_size、 join_buffer_size、 read_buffer_size 、 read_md_buffer_size 等设置也不要过大。