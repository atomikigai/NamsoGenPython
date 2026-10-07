package r3;

import b0.h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final h e = new h(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8127d;

    public a(int i, ArrayList arrayList, int i10, InputStream inputStream) {
        this.f8124a = i;
        this.f8125b = arrayList;
        this.f8126c = i10;
        this.f8127d = inputStream;
    }

    public synchronized byte[] a(int i) {
        for (int i10 = 0; i10 < ((ArrayList) this.f8127d).size(); i10++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f8127d).get(i10);
            if (bArr.length >= i) {
                this.f8124a -= bArr.length;
                ((ArrayList) this.f8127d).remove(i10);
                this.f8125b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f8126c) {
                this.f8125b.add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.f8127d, bArr, e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.f8127d).add(iBinarySearch, bArr);
                this.f8124a += bArr.length;
                synchronized (this) {
                    while (this.f8124a > this.f8126c) {
                        byte[] bArr2 = (byte[]) this.f8125b.remove(0);
                        ((ArrayList) this.f8127d).remove(bArr2);
                        this.f8124a -= bArr2.length;
                    }
                }
            }
        }
    }

    public a() {
        this.f8125b = new ArrayList();
        this.f8127d = new ArrayList(64);
        this.f8124a = 0;
        this.f8126c = 4096;
    }
}
