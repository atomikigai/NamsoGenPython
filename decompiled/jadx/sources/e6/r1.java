package e6;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements w5.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f3422b;

    public r1(q1 q1Var) {
        String strZze;
        this.f3422b = q1Var;
        try {
            strZze = q1Var.zze();
        } catch (RemoteException e) {
            i6.h.e("", e);
            strZze = null;
        }
        this.f3421a = strZze;
    }

    public final String toString() {
        return this.f3421a;
    }
}
