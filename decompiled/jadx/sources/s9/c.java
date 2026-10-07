package s9;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzjb;
import java.util.HashSet;
import s5.j;
import z7.k1;
import z7.m1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8462b;

    public /* synthetic */ c(Object obj, int i) {
        this.f8461a = i;
        this.f8462b = obj;
    }

    @Override // z7.m1
    public final void a(Bundle bundle, String str, String str2, long j4) {
        int i = this.f8461a;
        Object obj = this.f8462b;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                if (((HashSet) jVar.f8445b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    zzjb zzjbVar = b.f8456a;
                    String strF = k1.f(str2, k1.f11231c, k1.f11229a);
                    if (strF != null) {
                        str2 = strF;
                    }
                    bundle2.putString("events", str2);
                    ((j) jVar.f8446c).t(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !b.f8456a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j4);
                    bundle3.putBundle("params", bundle);
                    ((j) ((a5.b) obj).f188b).t(3, bundle3);
                    break;
                }
                break;
        }
    }
}
