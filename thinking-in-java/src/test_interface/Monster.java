package test_interface;

interface Monster {
    void menace();
}
interface DangerousMonster extends Monster{
    void destory();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{

    @Override
    public void menace() {

    }

    @Override
    public void destory() {

    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{

    @Override
    public void menace() {

    }

    @Override
    public void destory() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}