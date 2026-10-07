package t4;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class k extends o {
    public r4.c h;
    public String i;

    public k(Application application) {
        super(application);
    }

    @Override // d5.f
    public final void e() {
        j jVar = (j) this.f2923f;
        this.h = jVar.f8602a;
        this.i = jVar.f8603b;
    }

    @Override // d5.c
    public final void g(int i, int i10, Intent intent) {
        if (i != 110) {
            return;
        }
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.c.u(intent).getResult(com.google.android.gms.common.api.j.class);
            fd.e eVar = new fd.e(new s4.i("google.com", googleSignInAccount.f2009d, null, googleSignInAccount.e, googleSignInAccount.f2010f));
            eVar.f3914d = googleSignInAccount.f2008c;
            f(s4.h.c(eVar.c()));
        } catch (com.google.android.gms.common.api.j e) {
            if (e.getStatusCode() == 5) {
                this.i = null;
                i();
                return;
            }
            if (e.getStatusCode() == 12502) {
                i();
                return;
            }
            if (e.getStatusCode() == 12501) {
                f(s4.h.a(new s4.j(0)));
                return;
            }
            if (e.getStatusCode() == 10) {
                Log.w("GoogleSignInHandler", "Developer error: this application is misconfigured. Check your SHA1 and package name in the Firebase console.");
            }
            f(s4.h.a(new r4.g(4, "Code: " + e.getStatusCode() + ", message: " + e.getMessage())));
        }
    }

    @Override // d5.c
    public final void h(FirebaseAuth firebaseAuth, u4.c cVar, String str) {
        i();
    }

    public final void i() {
        Account account;
        Intent intentA;
        f(s4.h.b());
        Application applicationC = c();
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) this.h.a().getParcelable("extra_google_sign_in_options");
        new HashSet();
        new HashMap();
        i0.i(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.f2024b);
        boolean z4 = googleSignInOptions.e;
        boolean z10 = googleSignInOptions.f2027f;
        boolean z11 = googleSignInOptions.f2026d;
        String str = googleSignInOptions.f2028r;
        Account account2 = googleSignInOptions.f2025c;
        String str2 = googleSignInOptions.f2029s;
        HashMap mapH = GoogleSignInOptions.h(googleSignInOptions.f2030t);
        String str3 = googleSignInOptions.f2031u;
        if (TextUtils.isEmpty(this.i)) {
            account = account2;
        } else {
            String str4 = this.i;
            i0.e(str4);
            account = new Account(str4, "com.google");
        }
        if (hashSet.contains(GoogleSignInOptions.f2022z)) {
            Scope scope = GoogleSignInOptions.f2021y;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (z11 && (account == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f2020x);
        }
        d7.a aVar = new d7.a(applicationC, null, x6.b.f10299b, new GoogleSignInOptions(3, new ArrayList(hashSet), account, z11, z4, z10, str, str2, mapH, str3), new com.google.android.gms.common.api.k(new b9.e(8), Looper.getMainLooper()));
        Context applicationContext = aVar.getApplicationContext();
        int iC = aVar.c();
        int i = iC - 1;
        if (iC == 0) {
            throw null;
        }
        if (i == 2) {
            GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) aVar.getApiOptions();
            e7.h.f3486a.a("getFallbackSignInIntent()", new Object[0]);
            intentA = e7.h.a(applicationContext, googleSignInOptions2);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        } else if (i != 3) {
            GoogleSignInOptions googleSignInOptions3 = (GoogleSignInOptions) aVar.getApiOptions();
            e7.h.f3486a.a("getNoImplementationSignInIntent()", new Object[0]);
            intentA = e7.h.a(applicationContext, googleSignInOptions3);
            intentA.setAction("com.google.android.gms.auth.NO_IMPL");
        } else {
            intentA = e7.h.a(applicationContext, (GoogleSignInOptions) aVar.getApiOptions());
        }
        f(s4.h.a(new s4.d(intentA, 110)));
    }
}
