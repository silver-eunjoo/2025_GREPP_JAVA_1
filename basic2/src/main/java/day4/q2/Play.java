package day4.q2;

public class Play {

// 민텐도 스위치를
// 생성하고 동물들의 밀림, 셀다, 듀퍼마리오를 플레이하고자 합니다.

// 조건 1. 민텐도 스위치 본체 Class를 생성해주세요
// 조건 2. 게임 타이틀 3개를 생성해주세요
// 조건 3. 본체에 타이틀은 한개만 장착할 수 있습니다. 다른 타이틀 장착시 기존 타이틀을 null로 없애주세요
// 조건 4. 본체에 전원이 들어와있어야만 실행하거나 조작할 수 있습니다.
// 조건 5. 이미 본체에 전원이 있거나 없는데 중복조작은 안됩니다.

    public static void main(String[] args) {
        Mintendo mintendo = new Mintendo();
        mintendo.turnOff();
        mintendo.turnOn();

        mintendo.chooseGame("밀림");
        mintendo.chooseGame("셀다");
        mintendo.switchGame("듀퍼마리오");

        mintendo.turnOn();
        mintendo.turnOff();
    }

}
