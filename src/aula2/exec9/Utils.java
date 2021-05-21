package aula2.exec9;

import java.util.Arrays;

public class Utils {

    public static double areaMedia( GeometricFigure arr[] ) {
        double media = 0;
        for ( GeometricFigure x : arr ) {
            media += x.area();
        }
        return media / arr.length;
    }
}
