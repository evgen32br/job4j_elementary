package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
      int rsl = 0;
      if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
       boolean startPoint = Math.max(x1, y1) <= 7 && Math.min(x1, y1) >= 0;
       boolean finishPoint = Math.max(x2, y2) <= 7 && Math.min(x2, y2) >= 0;
       rsl = startPoint && finishPoint ? Math.abs(x2 - x1) : 0;
      }
      return rsl;
    }
}
