package t4;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzael;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import v9.h0;
import w9.b0;
import w9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class i extends d5.c {
    public i(Application application) {
        super(application);
    }

    @Override // d5.c
    public final void g(int i, int i10, Intent intent) {
        if (i == 117) {
            r4.i iVarB = r4.i.b(intent);
            if (iVarB == null) {
                f(s4.h.a(new s4.j(0)));
            } else {
                f(s4.h.c(iVarB));
            }
        }
    }

    @Override // d5.c
    public void h(FirebaseAuth firebaseAuth, u4.c cVar, String str) {
        Task taskForException;
        f(s4.h.b());
        s4.c cVarW = cVar.w();
        ta.c cVarI = i(str, firebaseAuth);
        if (cVarW != null) {
            a5.b.u().getClass();
            if (a5.b.s(firebaseAuth, cVarW)) {
                cVar.v();
                v9.n nVar = firebaseAuth.f2702f;
                nVar.getClass();
                d0 d0Var = (d0) nVar;
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(n9.g.e(d0Var.f9821c));
                firebaseAuth2.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                ea.e eVar = firebaseAuth2.f2711q.f9858b;
                if (eVar.f3515b) {
                    taskForException = Tasks.forException(zzadz.zza(new Status(17057, null, null, null)));
                } else {
                    eVar.g(cVar, new w9.i(eVar, cVar, taskCompletionSource, firebaseAuth2, nVar));
                    eVar.f3515b = true;
                    Context applicationContext = cVar.getApplicationContext();
                    i0.i(applicationContext);
                    SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    n9.g gVar = firebaseAuth2.f2698a;
                    gVar.a();
                    editorEdit.putString("firebaseAppName", gVar.f7360b);
                    editorEdit.putString("firebaseUserUid", d0Var.f9820b.f9806a);
                    editorEdit.commit();
                    Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                    intent.setClass(cVar, GenericIdpActivity.class);
                    intent.setPackage(cVar.getPackageName());
                    intent.putExtras((Bundle) cVarI.f8662a);
                    cVar.startActivity(intent);
                    taskForException = taskCompletionSource.getTask();
                }
                taskForException.addOnSuccessListener(new h(this, cVarI, 0)).addOnFailureListener(new e5.a(this, firebaseAuth, cVarW, cVarI));
                return;
            }
        }
        cVar.v();
        firebaseAuth.e(cVar, cVarI).addOnSuccessListener(new h(this, cVarI, 1)).addOnFailureListener(new h(this, cVarI, 2));
    }

    public final ta.c i(String str, FirebaseAuth firebaseAuth) {
        i0.e(str);
        i0.i(firebaseAuth);
        n9.g gVar = firebaseAuth.f2698a;
        if ("facebook.com".equals(str) && !zzafx.zzg(gVar)) {
            throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        gVar.a();
        bundle.putString("com.google.firebase.auth.KEY_API_KEY", gVar.f7361c.f7366a);
        bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
        bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
        bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzael.zza().zzb());
        bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.a());
        gVar.a();
        bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", gVar.f7360b);
        ArrayList<String> stringArrayList = ((r4.c) this.f2923f).a().getStringArrayList("generic_oauth_scopes");
        HashMap map = (HashMap) ((r4.c) this.f2923f).a().getSerializable("generic_oauth_custom_parameters");
        if (stringArrayList != null) {
            bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(stringArrayList));
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new ta.c(bundle);
    }

    public final void j(String str, d0 d0Var, h0 h0Var, boolean z4) {
        String str2 = h0Var.f9250c;
        String str3 = h0Var.f9252f;
        b0 b0Var = d0Var.f9820b;
        fd.e eVar = new fd.e(new s4.i(str, b0Var.f9810f, null, b0Var.f9808c, d0Var.h()));
        eVar.f3914d = str2;
        eVar.e = str3;
        eVar.f3913c = h0Var;
        eVar.f3911a = z4;
        f(s4.h.c(eVar.c()));
    }
}
