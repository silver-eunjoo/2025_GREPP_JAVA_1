package day4.q2;

public class Mintendo {
    private String gameTitle = null;
    private boolean power = false;

    public void Mintendo() {

    }

    public void turnOn() {
        if(power) {
            System.out.println("이미 전원이 켜져있습니다.");
        }else{
            power = true;
            System.out.println("전원을 켭니다.");
        }
    }

    public void turnOff() {
        if(power) {
            power = false;
            System.out.println("전원을 종료합니다.");
        }else{
            System.out.println("이미 전원이 종료되었습니다.");
        }
    }

    public void chooseGame(String name) {
        if(power) {
            if(gameTitle != null){
                System.out.println("이미 게임을 실행중입니다.");
            }else{
                this.gameTitle = name;
                System.out.println(name + "게임을 실행합니다.");
            }

        }
        else{
            System.out.println("전원이 꺼져있습니다. 게임을 실행할 수 없습니다.");
        }
    }

    public void switchGame(String name) {
        if(power) {
            if(gameTitle==null) {
                System.out.println("아직 어떤 게임도 실행중이지 않습니다.");
            }else{
                System.out.println(this.gameTitle + "을 종료합니다.");
                this.gameTitle = name;
                System.out.println(name + "게임을 실행합니다.");
            }
        }
        else{
            System.out.println("전원이 꺼져있습니다. 게임을 실행할 수 없습니다.");
        }
    }
}
