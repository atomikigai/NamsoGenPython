package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f788a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f791d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f792f;

    public q(t tVar) {
        this.f789b = tVar;
        this.f790c = tVar;
    }

    public final int a(int i) {
        SparseArray sparseArray = this.f790c.f801a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(i);
        int i10 = 1;
        int i11 = 2;
        if (this.f788a == 2) {
            if (tVar != null) {
                this.f790c = tVar;
                this.f792f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                t tVar2 = this.f790c;
                if (tVar2.f802b != null) {
                    i11 = 3;
                    if (this.f792f != 1) {
                        this.f791d = tVar2;
                        b();
                    } else if (c()) {
                        this.f791d = this.f790c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i10 = i11;
        } else if (tVar == null) {
            b();
        } else {
            this.f788a = 2;
            this.f790c = tVar;
            this.f792f = 1;
            i10 = i11;
        }
        this.e = i;
        return i10;
    }

    public final void b() {
        this.f788a = 1;
        this.f790c = this.f789b;
        this.f792f = 0;
    }

    public final boolean c() {
        f1.a aVarB = this.f790c.f802b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f3578d).get(iA + aVarB.f3575a) == 0) || this.e == 65039;
    }
}
