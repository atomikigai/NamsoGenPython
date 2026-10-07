package d7;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.i0;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f3001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3004d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Account f3005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3006g;
    public final HashMap h;
    public String i;

    public b() {
        this.f3001a = new HashSet();
        this.h = new HashMap();
    }

    public b(GoogleSignInOptions googleSignInOptions) {
        this.f3001a = new HashSet();
        this.h = new HashMap();
        i0.i(googleSignInOptions);
        this.f3001a = new HashSet(googleSignInOptions.f2024b);
        this.f3002b = googleSignInOptions.e;
        this.f3003c = googleSignInOptions.f2027f;
        this.f3004d = googleSignInOptions.f2026d;
        this.e = googleSignInOptions.f2028r;
        this.f3005f = googleSignInOptions.f2025c;
        this.f3006g = googleSignInOptions.f2029s;
        this.h = GoogleSignInOptions.h(googleSignInOptions.f2030t);
        this.i = googleSignInOptions.f2031u;
    }
}
