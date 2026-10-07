package x1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10196d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10198g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10203n;

    public final void a(int i) {
        if ((this.f10196d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f10196d));
    }

    public final int b() {
        return this.f10198g ? this.f10194b - this.f10195c : this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f10193a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f10194b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10195c + ", mStructureChanged=" + this.f10197f + ", mInPreLayout=" + this.f10198g + ", mRunSimpleAnimations=" + this.f10199j + ", mRunPredictiveAnimations=" + this.f10200k + '}';
    }
}
