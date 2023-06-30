package cn.fzx.annotationtest.repeatable.old;

/**
 * @author fangzhixiang
 * @date 2023-01-05
 */
public class RepeatAnnotationUseOldVersion {

	@OldAuthorities(roles = {@OldAuthority(role = "Admin"),@OldAuthority(role = "Staff")})
	public void doSomeThing() {
		System.out.println("我在做事情了，在做啦。");
	}
}
