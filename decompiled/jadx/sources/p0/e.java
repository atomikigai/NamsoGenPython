package p0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f7783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7784b;

    public e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7783a = new Object[i];
    }

    public void a(u.b bVar) {
        int i = this.f7784b;
        Object[] objArr = this.f7783a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f7784b = i + 1;
        }
    }

    @Override // p0.d
    public boolean b(Object obj) {
        int i = 0;
        while (true) {
            int i10 = this.f7784b;
            Object[] objArr = this.f7783a;
            if (i >= i10) {
                if (i10 >= objArr.length) {
                    return false;
                }
                objArr[i10] = obj;
                this.f7784b = i10 + 1;
                return true;
            }
            if (objArr[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }

    @Override // p0.d
    public Object c() {
        int i = this.f7784b;
        if (i <= 0) {
            return null;
        }
        int i10 = i - 1;
        Object[] objArr = this.f7783a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f7784b = i - 1;
        return obj;
    }

    public e() {
        this.f7783a = new Object[256];
    }
}
