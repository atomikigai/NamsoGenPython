package b1;

import a2.y;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.j0;
import c1.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import r7.g;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f1345d;
    public final Set e;

    public c(Context context, Set set, y yVar, k kVar) {
        jc.i.e(context, "context");
        jc.i.e(set, "keysToMigrate");
        j0 j0Var = new j0(context, 1);
        this.f1342a = yVar;
        this.f1343b = kVar;
        this.f1344c = context;
        this.f1345d = new i(j0Var);
        this.e = set == d.f1346a ? null : new LinkedHashSet(set);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, ac.c cVar) {
        b bVar;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.f1341d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f1341d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objInvoke = bVar.f1339b;
        zb.a aVar = zb.a.f11555a;
        int i10 = bVar.f1341d;
        boolean z4 = true;
        if (i10 == 0) {
            g.G(objInvoke);
            bVar.f1338a = this;
            bVar.f1341d = 1;
            objInvoke = this.f1342a.invoke(obj, bVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            cVar2 = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = bVar.f1338a;
            g.G(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = cVar2.e;
        i iVar = cVar2.f1345d;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) iVar.getValue()).getAll();
            jc.i.d(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z4 = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) iVar.getValue();
            if (set.isEmpty()) {
                z4 = false;
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z4 = false;
            }
        }
        return Boolean.valueOf(z4);
    }
}
