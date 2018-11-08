package com.fus;

import com.fus.entity.PositionEntity;
import com.fus.entity.UserEntity;
import com.fus.repository.primary.UserRepository;
import com.fus.repository.secondary.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private PositionRepository positionRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void TestSave() {

		System.out.println("************************************************************");
		System.out.println("测试开始");
		System.out.println("************************************************************");

//		List<UserEntity> primaries = this.userRepository.findAll();
//		for (UserEntity primary : primaries) {
//			System.out.println(primary.toString());
//		}

        System.out.println("************************************************************");

        for (Long i=400L;i<500;i++ ) {
            PositionEntity user=new PositionEntity(i.toString(),String.valueOf(i+50),i.toString(),String.valueOf(i+100), String.valueOf(i+200),"test"+i.toString());
            this.positionRepository.save(user);
        }
		System.out.println("************************** 300 **********************************");

		List<PositionEntity> secondaries = this.positionRepository.findAll();

		for (PositionEntity secondary : secondaries) {
			System.out.println(secondary.toString());
		}

		System.out.println("************************************************************");
		System.out.println("测试完成");
		System.out.println("************************************************************");
	}

}
