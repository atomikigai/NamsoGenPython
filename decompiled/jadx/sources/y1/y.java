package y1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h2.g, h2.f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TreeMap f10528t = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f10530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f10532d;
    public final String[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f10533f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f10534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10535s;

    public y(int i) {
        this.f10529a = i;
        int i10 = i + 1;
        this.f10534r = new int[i10];
        this.f10531c = new long[i10];
        this.f10532d = new double[i10];
        this.e = new String[i10];
        this.f10533f = new byte[i10][];
    }

    public static final y d(int i, String str) {
        TreeMap treeMap = f10528t;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                y yVar = new y(i);
                yVar.f10530b = str;
                yVar.f10535s = i;
                return yVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            y yVar2 = (y) entryCeilingEntry.getValue();
            yVar2.f10530b = str;
            yVar2.f10535s = i;
            return yVar2;
        }
    }

    @Override // h2.f
    public final void I(int i) {
        this.f10534r[i] = 1;
    }

    @Override // h2.f
    public final void b(int i, long j4) {
        this.f10534r[i] = 2;
        this.f10531c[i] = j4;
    }

    @Override // h2.g
    public final void c(h2.f fVar) {
        int i = this.f10535s;
        if (1 > i) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f10534r[i10];
            if (i11 == 1) {
                fVar.I(i10);
            } else if (i11 == 2) {
                fVar.b(i10, this.f10531c[i10]);
            } else if (i11 == 3) {
                fVar.l(i10, this.f10532d[i10]);
            } else if (i11 == 4) {
                String str = this.e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar.j(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f10533f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar.w(i10, bArr);
            }
            if (i10 == i) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g() {
        TreeMap treeMap = f10528t;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10529a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                jc.i.d(it, "iterator(...)");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // h2.f
    public final void j(int i, String str) {
        jc.i.e(str, "value");
        this.f10534r[i] = 4;
        this.e[i] = str;
    }

    @Override // h2.f
    public final void l(int i, double d10) {
        this.f10534r[i] = 3;
        this.f10532d[i] = d10;
    }

    @Override // h2.g
    public final String o() {
        String str = this.f10530b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // h2.f
    public final void w(int i, byte[] bArr) {
        this.f10534r[i] = 5;
        this.f10533f[i] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
