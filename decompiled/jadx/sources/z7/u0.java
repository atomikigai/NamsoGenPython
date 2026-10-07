package z7;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzff;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends r.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f11376a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var) {
        super(20);
        this.f11376a = v0Var;
    }

    @Override // r.j
    public final Object create(Object obj) {
        zzff zzffVar;
        String str = (String) obj;
        com.google.android.gms.common.internal.i0.e(str);
        v0 v0Var = this.f11376a;
        v0Var.d();
        r.e eVar = v0Var.f11399s;
        com.google.android.gms.common.internal.i0.e(str);
        if (TextUtils.isEmpty(str) || (zzffVar = (zzff) eVar.get(str)) == null || zzffVar.zza() == 0) {
            return null;
        }
        if (!eVar.containsKey(str) || eVar.get(str) == null) {
            v0Var.j(str);
        } else {
            v0Var.k(str, (zzff) eVar.get(str));
        }
        return (zzc) v0Var.f11401u.snapshot().get(str);
    }
}
