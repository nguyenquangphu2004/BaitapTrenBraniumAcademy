package Bai10.Bai4;

public class Test implements Functional{
    @Override
    public void fingerPrint(boolean value) {
        if(value == true) {
            try {
                System.out.println("Đang xác nhận vân tay");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                        System.out.println("Xác nhận thành công");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            try {
                System.out.println("Đang xác nhận vân tay");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Xác nhận thất bại");
        }
    }

    @Override
    public void faceId(boolean value) {
        if(value == true) {
            try {
                System.out.println("Đang xác nhận khuôn mặt");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                        System.out.println("Xác nhận thành công");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            try {
                System.out.println("Đang xác nhận khuôn mặt");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Xác nhận thất bại");
        }
    }

    @Override
    public void identified(boolean value) {

    }

    @Override
    public void restart(boolean value) {
        if(value == true) {
            try {
                System.out.println("Chuẩn bị khởi động lại máy");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                        System.out.println("Khởi động thành công");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            try {
                System.out.println("Chuẩn bị khởi động lại máy");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Khởi động thất bại");
        }

    }

    @Override
    public void turnOff(boolean value) {
        if(value == true) {
            try {
                System.out.println("Chuẩn bị tắt máy");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                        System.out.println("Tắt máy thành công");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            try {
                System.out.println("Chuẩn bị tắt lại máy");
                int i = 1;
                while(i <= 100) {
                    Thread.sleep(200);
                    if(i == 1) {
                        System.out.print("1%");
                    }
                    System.out.printf("=");
                    if(i == 97) {
                        System.out.print(">100%\n");
                    }
                    i += 4;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tắt máy thất bại");

        }
    }

    @Override
    public void showResult(String value) {

    }

}
