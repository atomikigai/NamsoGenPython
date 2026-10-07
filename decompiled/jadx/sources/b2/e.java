package b2;

import android.database.Cursor;
import java.util.Arrays;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1356d;
    public long[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f1357f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f1358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[][] f1359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Cursor f1360t;

    public static void o(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            jd.d.K(25, "column index out of range");
            throw null;
        }
    }

    @Override // g2.c
    public final String F(int i) {
        c();
        Cursor cursor = this.f1360t;
        if (cursor == null) {
            jd.d.K(21, "no row");
            throw null;
        }
        o(cursor, i);
        String string = cursor.getString(i);
        i.d(string, "getString(...)");
        return string;
    }

    @Override // g2.c
    public final boolean O() {
        c();
        g();
        Cursor cursor = this.f1360t;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // g2.c
    public final void b(int i, long j4) {
        c();
        d(1, i);
        this.f1356d[i] = 1;
        this.e[i] = j4;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f1364c) {
            c();
            this.f1356d = new int[0];
            this.e = new long[0];
            this.f1357f = new double[0];
            this.f1358r = new String[0];
            this.f1359s = new byte[0][];
            reset();
        }
        this.f1364c = true;
    }

    public final void d(int i, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f1356d;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            i.d(iArrCopyOf, "copyOf(...)");
            this.f1356d = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i11) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
                i.d(jArrCopyOf, "copyOf(...)");
                this.e = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f1357f;
            if (dArr.length < i11) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
                i.d(dArrCopyOf, "copyOf(...)");
                this.f1357f = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f1358r;
            if (strArr.length < i11) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
                i.d(objArrCopyOf, "copyOf(...)");
                this.f1358r = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f1359s;
        if (bArr.length < i11) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i11);
            i.d(objArrCopyOf2, "copyOf(...)");
            this.f1359s = (byte[][]) objArrCopyOf2;
        }
    }

    public final void g() {
        if (this.f1360t == null) {
            this.f1360t = this.f1362a.p(new e7.i(this, 9));
        }
    }

    @Override // g2.c
    public final int getColumnCount() {
        c();
        g();
        Cursor cursor = this.f1360t;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // g2.c
    public final String getColumnName(int i) {
        c();
        g();
        Cursor cursor = this.f1360t;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        o(cursor, i);
        String columnName = cursor.getColumnName(i);
        i.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // g2.c
    public final long getLong(int i) {
        c();
        Cursor cursor = this.f1360t;
        if (cursor != null) {
            o(cursor, i);
            return cursor.getLong(i);
        }
        jd.d.K(21, "no row");
        throw null;
    }

    @Override // g2.c
    public final boolean isNull(int i) {
        c();
        Cursor cursor = this.f1360t;
        if (cursor != null) {
            o(cursor, i);
            return cursor.isNull(i);
        }
        jd.d.K(21, "no row");
        throw null;
    }

    @Override // g2.c
    public final void n() {
        c();
        d(5, 4);
        this.f1356d[4] = 5;
    }

    @Override // g2.c
    public final void q(int i, String str) {
        i.e(str, "value");
        c();
        d(3, i);
        this.f1356d[i] = 3;
        this.f1358r[i] = str;
    }

    @Override // g2.c
    public final void reset() {
        c();
        Cursor cursor = this.f1360t;
        if (cursor != null) {
            cursor.close();
        }
        this.f1360t = null;
    }
}
