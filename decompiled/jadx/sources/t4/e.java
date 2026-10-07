package t4;

import android.app.Application;
import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.WebDialog;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class e extends o {
    public ArrayList h;
    public final FacebookCallback i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CallbackManager f8597j;

    public e(Application application) {
        super(application);
        this.i = new d();
        this.f8597j = CallbackManager.Factory.create();
    }

    @Override // d5.f, androidx.lifecycle.p0
    public final void b() {
        super.b();
        LoginManager.getInstance().unregisterCallback(this.f8597j);
    }

    @Override // d5.f
    public final void e() {
        Collection stringArrayList = ((r4.c) this.f2923f).a().getStringArrayList("extra_facebook_permissions");
        if (stringArrayList == null) {
            stringArrayList = Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(stringArrayList);
        if (!arrayList.contains("email")) {
            arrayList.add("email");
        }
        if (!arrayList.contains("public_profile")) {
            arrayList.add("public_profile");
        }
        this.h = arrayList;
        LoginManager.getInstance().registerCallback(this.f8597j, this.i);
    }

    @Override // d5.c
    public final void g(int i, int i10, Intent intent) {
        this.f8597j.onActivityResult(i, i10, intent);
    }

    @Override // d5.c
    public final void h(FirebaseAuth firebaseAuth, u4.c cVar, String str) {
        WebDialog.setWebDialogTheme(cVar.w().f8397d);
        LoginManager.getInstance().logInWithReadPermissions(cVar, this.h);
    }
}
