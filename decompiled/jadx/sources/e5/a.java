package e5;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import h3.e1;
import h3.j0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import q3.m;
import v9.l;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnCompleteListener, Continuation, m, OnFailureListener, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3278d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3275a = obj;
        this.f3276b = obj2;
        this.f3277c = obj3;
        this.f3278d = obj4;
    }

    @Override // q3.m
    public void e(Object obj) {
        e1 e1Var = (e1) this.f3275a;
        String str = (String) this.f3276b;
        String str2 = (String) this.f3277c;
        j0 j0Var = (j0) this.f3278d;
        JSONObject jSONObject = (JSONObject) obj;
        String strOptString = jSONObject.isNull("status") ? null : jSONObject.optString("status");
        Long lValueOf = jSONObject.isNull("t") ? null : Long.valueOf(jSONObject.optLong("t"));
        HashMap map = e1Var.f4685z0;
        Object map2 = map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        ((Map) map2).put(str2, new ub.f(strOptString, lValueOf));
        j0Var.b(Boolean.TRUE, strOptString, lValueOf);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        b bVar = (b) this.f3275a;
        String str = (String) this.f3276b;
        String str2 = (String) this.f3277c;
        String str3 = (String) this.f3278d;
        bVar.getClass();
        if (!task.isSuccessful()) {
            bVar.f(s4.h.a(task.getException()));
            return;
        }
        a5.c cVar = a5.c.f190c;
        Application applicationC = bVar.c();
        cVar.getClass();
        i0.i(str);
        SharedPreferences.Editor editorEdit = applicationC.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        editorEdit.putString("com.firebase.ui.auth.data.client.email", str);
        editorEdit.putString("com.firebase.ui.auth.data.client.auid", str3);
        editorEdit.putString("com.firebase.ui.auth.data.client.sid", str2);
        editorEdit.apply();
        bVar.f(s4.h.c(str));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        t4.i iVar = (t4.i) this.f3275a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f3276b;
        s4.c cVar = (s4.c) this.f3277c;
        ta.c cVar2 = (ta.c) this.f3278d;
        if (!(exc instanceof l)) {
            iVar.f(s4.h.a(exc));
            return;
        }
        l lVar = (l) exc;
        v9.d dVar = lVar.f9263b;
        String str = lVar.f9264c;
        com.bumptech.glide.d.l(firebaseAuth, cVar, str).addOnSuccessListener(new a(iVar, cVar2, dVar, str));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        t4.i iVar = (t4.i) this.f3275a;
        ta.c cVar = (ta.c) this.f3277c;
        v9.d dVar = (v9.d) this.f3278d;
        String str = (String) this.f3276b;
        List list = (List) obj;
        if (list.isEmpty()) {
            iVar.f(s4.h.a(new r4.g(3, "Unable to complete the linkingflow - the user is using unsupported providers.")));
        } else {
            if (!list.contains(cVar.h())) {
                iVar.f(s4.h.a(new r4.h(cVar.h(), str, dVar)));
                return;
            }
            fd.e eVar = new fd.e();
            eVar.f3913c = dVar;
            iVar.f(s4.h.a(new r4.f(eVar.c())));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        f fVar = (f) this.f3275a;
        a5.c cVar = (a5.c) this.f3276b;
        v9.d dVar = (v9.d) this.f3277c;
        r4.i iVar = (r4.i) this.f3278d;
        Application applicationC = fVar.c();
        cVar.getClass();
        a5.c.a(applicationC);
        return !task.isSuccessful() ? task : ((a0) task.getResult()).f9802a.k(dVar).continueWithTask(new q3.e(iVar)).addOnFailureListener(new a5.g("EmailLinkSignInHandler", "linkWithCredential+merge failed."));
    }

    public /* synthetic */ a(t4.i iVar, ta.c cVar, v9.d dVar, String str) {
        this.f3275a = iVar;
        this.f3277c = cVar;
        this.f3278d = dVar;
        this.f3276b = str;
    }
}
