public class Metrics {
    public static long comparisons, moves;
    public static int depth, maxDepth;
    public static void reset(){ comparisons=moves=0; depth=maxDepth=0; }
    public static void stepDepth(int d){ depth+=d; if(depth>maxDepth) maxDepth=depth; }
}
