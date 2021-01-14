package lesson28_1301;

import _UsefulMethods.Color;

import java.util.Scanner;

public class TilesCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину комнаты (см): ");
        double roomLength = input.nextDouble();
        System.out.println("Введите ширину комнаты (см): ");
        double roomWidth = input.nextDouble();
        System.out.println("Введите стоимость плитки (шт): ");
        double oneTilePrice = input.nextDouble();

        int tileLength = 30;
        int tileWidth = 20;

        System.out.println(Color.ANSI_PURPLE + "Стоимость работы мастера для данного помещения с учетом НДС: " + workPrice(roomLength, roomWidth));
        System.out.println();

        System.out.println(Color.ANSI_GREEN + "Необходимо плиток при укладке вдоль: " + totalMaterialPriceAlong(roomLength, roomWidth, tileLength, tileWidth, 1));
        System.out.println(Color.ANSI_GREEN + "Общая стоимость при укладке вдоль: " + totalPriceAlong(roomLength, roomWidth, tileLength, tileWidth, oneTilePrice));
        System.out.println();
        System.out.println(Color.ANSI_RED + "Необходимо плиток при укладке поперек: " + totalMaterialPriceAcross(roomLength, roomWidth, tileLength, tileWidth, 1));
        System.out.println(Color.ANSI_RED + "Общая стоимость при укладке поперек: " + totalPriceAcross(roomLength, roomWidth, tileLength, tileWidth, oneTilePrice));


    }

    private static double totalPriceAlong(double roomLength, double roomWidth, double tileLength, double tileWidth, double oneTilePrice) {
        return totalMaterialPriceAlong(roomLength, roomWidth, tileLength, tileWidth, oneTilePrice) + workPrice(roomLength, roomWidth);
    }

    private static double totalPriceAcross(double roomLength, double roomWidth, double tileLength, double tileWidth, double oneTilePrice) {
        return totalMaterialPriceAcross(roomLength, roomWidth, tileLength, tileWidth, oneTilePrice) + workPrice(roomLength, roomWidth);
    }

    private static int totalMaterialPriceAlong(double roomLength, double roomWidth, double tileLength, double tileWidth, double oneTilePrice) {
        return (int) (calculateTileQtyAlong(roomLength, roomWidth, tileLength, tileWidth) * oneTilePrice);
    }

    private static int totalMaterialPriceAcross(double roomLength, double roomWidth, double tileLength, double tileWidth, double oneTilePrice) {
        return (int) (calculateTileQtyAcross(roomLength, roomWidth, tileLength, tileWidth) * oneTilePrice);

    }

    private static double workPrice(double roomLength, double roomWidth) {
        double withoutTax = ((calculateSurfaceArea(roomLength, roomWidth)) / 10000) * 27;
        double tax = withoutTax / 100 * 19;
        return withoutTax + tax;
    }


    private static double calculateTileQtyAlong(double roomLength, double roomWidth, double tileLength, double tileWidth) {
        double relationAlong1 = roomLength / tileLength;
        double relationAlong2 = roomWidth / tileWidth;
        int amountNeededLength = (int) Math.ceil(relationAlong1);
        int amountNeededWidth = (int) Math.ceil(relationAlong2);
        return amountNeededLength * amountNeededWidth;
    }

    private static double calculateTileQtyAcross(double roomLength, double roomWidth, double tileLength, double tileWidth) {
        double relationAlong1 = roomWidth / tileLength;
        double relationAlong2 = roomLength / tileWidth;
        int amountNeededLength = (int) Math.ceil(relationAlong1);
        int amountNeededWidth = (int) Math.ceil(relationAlong2);
        return amountNeededLength * amountNeededWidth;
    }


    private static double calculateSurfaceArea(double roomLength, double roomWidth) {
        return roomLength * roomWidth;
    }
}
