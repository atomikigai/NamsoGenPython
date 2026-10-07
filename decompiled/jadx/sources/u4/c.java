package u4;

import android.content.Context;
import android.content.Intent;
import com.firebase.ui.auth.ui.credentials.CredentialSaveActivity;
import java.util.Set;
import jd.l;
import r4.i;
import v9.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends g.g implements g {
    public s4.c K;

    public static Intent t(Context context, Class cls, s4.c cVar) {
        p3.a.g(context, "context cannot be null", new Object[0]);
        Intent intent = new Intent(context, (Class<?>) cls);
        p3.a.g(cVar, "flowParams cannot be null", new Object[0]);
        Intent intentPutExtra = intent.putExtra("extra_flow_params", cVar);
        intentPutExtra.setExtrasClassLoader(r4.e.class.getClassLoader());
        return intentPutExtra;
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        if (i == 102 || i10 == 5) {
            u(intent, i10);
        }
    }

    public void u(Intent intent, int i) {
        setResult(i, intent);
        finish();
    }

    public final r4.e v() {
        String str = w().f8394a;
        Set set = r4.e.f8153c;
        return r4.e.a(n9.g.e(str));
    }

    public final s4.c w() {
        if (this.K == null) {
            this.K = (s4.c) getIntent().getParcelableExtra("extra_flow_params");
        }
        return this.K;
    }

    public final void x(n nVar, i iVar, String str) {
        startActivityForResult(t(this, CredentialSaveActivity.class, w()).putExtra("extra_credential", l.c(nVar, str, iVar == null ? null : com.bumptech.glide.d.z(iVar.e()))).putExtra("extra_idp_response", iVar), 102);
    }
}
