package m5;

import a2.l;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import h6.o0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f7067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7068c;

    public d(Context context, l lVar) {
        o0 o0Var = new o0(context, 11);
        this.f7068c = new HashMap();
        this.f7066a = o0Var;
        this.f7067b = lVar;
    }

    public final synchronized e a(String str) {
        if (this.f7068c.containsKey(str)) {
            return (e) this.f7068c.get(str);
        }
        CctBackendFactory cctBackendFactoryF = this.f7066a.f(str);
        if (cctBackendFactoryF == null) {
            return null;
        }
        l lVar = this.f7067b;
        e eVarCreate = cctBackendFactoryF.create(new b((Context) lVar.f43b, (u5.a) lVar.f44c, (u5.a) lVar.f45d, str));
        this.f7068c.put(str, eVarCreate);
        return eVarCreate;
    }
}
