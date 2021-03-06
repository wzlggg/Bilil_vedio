package club.evolutioniot.ssh.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import club.evolutioniot.ssh.system.domain.Remark;
import club.evolutioniot.ssh.system.service.PlayUserService;
import club.evolutioniot.ssh.system.service.RemarkService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/beans.xml")
public class RemarkTest {
	@Autowired
	RemarkService remarkService;
	@Autowired
	PlayUserService userService;
	/*评论区实现*/
	@Test//ok
	public void testRemark(){
	remarkService.findAllRemark().stream().forEach(System.out::println);
	System.out.println("********************");
	remarkService.findAllRightRemark().stream().forEach(System.out::println);
	System.out.println("********************");
	remarkService.findAllBlockRemark().stream().forEach(System.out::println);
	}
	
	@Test//OK
	public void addRemark(){
		Remark remark=new Remark();
		remark.setRemarkContent("3真的太棒了！");
		remark.setRemarkTime(new Date());
		remark.setRemarkState(1);
		remarkService.addRemark(remark);
		System.out.println(remark);
	}
	@Test//OK
	public void deleteRemark(){
		Remark remark=new Remark();
		remark.setRemarkId(1);
		remarkService.deleteRemark(remark);
	}
	@Test//ok
	public void selectRemarkByPlayUserId(){
		List<Remark> re = remarkService.selectRemarkByPlayUserId(1);
		System.out.println(re);
	}
	@Test//ok
	public void selectRemarkByVedioId(){
		List<Remark> re = remarkService.selectRemarkByVedioId(1);
		System.out.println(re);
	}
	@Test
	public void selectRemarkByRemarkContent(){
		List<Remark> re=remarkService.selectRemarkByRemarkContent("的");
		System.out.println(re);
		}
	
	@Test
	public Remark findRemarkByRemarkId(){
		Remark re=new Remark();
		re.setRemarkId(1);
		System.out.println(re);
		return re;
		
	}

	
	/*@Test
	public void selectRemarkByRemarkTime(){
		List<Remark> re=remarkService.selectRemarkByRemarkTime();
		System.out.println(re);
		}*/

}
