package Bai11.Bai1;

public interface AccountManager {
    /*
     * Thiết kế interface cho phép quản lý tài khoản gồm các thao tác:
     * đăng kí
     * đăng nhập
     * đăng xuất
     * xóa tài khoản
     * ->add: vô hiệu hóa TK
     * khôi phục tài khoản
     * đổi mật khẩu
     * ->add: cấp lại mật khẩu
     * chỉnh sửa thông tin tài khoản
     */

    boolean signup(Account account);

    boolean login(Account account);

    boolean logout(Account account);

    boolean removeAccount(Account account);

    boolean restoreAccount(Account account);

    boolean changePassWord(Account account);

    boolean changeInfor(Account account);

    default void deactiveAccount(Account account) { // vô hiệu hóa tài khoản.

    }
    default int randomPassWord(Account account) {
        return 0;
    }



}
