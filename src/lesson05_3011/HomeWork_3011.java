package lesson05_3011;

public class HomeWork_3011 {
    public static void main(String[] args) {
        /*Родители Василия добились успехов в программировании и смогли передать свои знания сыну. Василий вырос и
        запрограммировал систему аварийного уничтожения первых космических кораблей земли, улетевших в Альфа-
                Центавру. Система уничтожения реагирует на ввод команд двух старших офицеров корабля.*/
        System.out.println("Если нажали оба: " + bigBadaBoom(true, true)); // true
        System.out.println("Если никто не нажал: " + bigBadaBoom(false, false));// false
        System.out.println("Если нажал только один: " + bigBadaBoom(true, false));// false
        split();
        /*На даче у родителей Васи Сидорова решили поставить звонок, который должен звонить при нажатии на кнопку
    звонка у калитки или у двери дома. Если соседские дети начинают играться и нажимать на кнопки звонка
о   одновременно и на калитке и на доме, звонок не должен реагировать. Напишите программу управления звонком.*/
        System.out.println("Дети балуются: " + doorbell(true, true));
        System.out.println("Никто не звонит: " + doorbell(false, false));
        System.out.println("Настоящий звонок: " + doorbell(true, false));
        split();
        /*Программирование всё больше захватывало семью Василия и они решили сделать полностью умный дом. Для
    начала они решили сделать входную дверь учитывая новые стандарты. Дверь больше нельзя открыть обычным
    ключом, пока в доме есть интернет и она подключена к электросети. Напишите тесты для программы
    smartDoorCheckKey. Заказчик(бабушка Василия), хочет, что бы мы проконтролировали работу сторонней фирмы.*/
        System.out.println(smartDoorCheckKey(false, false, false));
        System.out.println(smartDoorCheckKey(false, false, true));//true
        System.out.println(smartDoorCheckKey(false, true, true));//true
        System.out.println(smartDoorCheckKey(false, true, false));
        System.out.println(smartDoorCheckKey(true, true, true));
        System.out.println(smartDoorCheckKey(true, false, false));
        System.out.println(smartDoorCheckKey(true, false, true));//true
        System.out.println(smartDoorCheckKey(true, true, false));//true
        split();
        /*7. Сторонняя фирма не справилась с написанием программы. Напишите самостоятельно метод, который возвращает
        false, если дверь открыть ключом нельзя */
        //Рассматриваю только варианты, где ключ имеется в наличии:
        System.out.println(checkKeyForbidden(false, false, true));
        System.out.println(checkKeyForbidden(false, true, true));
        System.out.println(checkKeyForbidden(true, true, true));//false
        System.out.println(checkKeyForbidden(true, false, true));
        split();
        /*8. Родители сделали в итоге самостоятельно всё программирование вокруг двери не дожидаясь нас. Попробуйте
        угадать как же работает метод, которрый позволяет Василию открыть дверь телефоном, отпечатком пальца или
        введённым с клавиатуры паролем.*/
        System.out.println(verySmartDoor(false, true, false)); //true
        System.out.println(verySmartDoor(false, false, true));//true
        System.out.println(verySmartDoor(true, false, false)); //true
        System.out.println(verySmartDoor(false, false, false)); //false
        split();
        /*9. В девятом классе Вася ездил со своим и параллельным классом в Париж. Известно, что на двоих учителей нельзя
        брать в поездку больше 25 детей. Напишите проверочный метод*/
        System.out.println(paris(11, 15)); //false
        System.out.println(paris(11, 5)); //true
    }

    public static void split() {
        System.out.println("______________________________");
    }

    static public boolean bigBadaBoom(boolean officer1, boolean officer2) {
        return officer1 && officer2;
    }

    public static boolean doorbell(boolean door, boolean wicket) {
        return door ^ wicket;
    }

    public static boolean smartDoorCheckKey(boolean internet, boolean electricity, boolean key) {
        return (internet && electricity) ^ key;
    }

    public static boolean checkKeyForbidden(boolean internet, boolean electricity, boolean key) {
        return smartDoorCheckKey(internet, electricity, key) && key;
    }

    public static boolean verySmartDoor(boolean phone, boolean fingerprint, boolean password) {
        return phone || fingerprint || password;
    }

    public static boolean paris(int class1, int class2) {
        boolean all = (class1 + class2) <= 25;
        return all;
    }
}

