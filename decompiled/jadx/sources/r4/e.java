package r4;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeo;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f8153c = Collections.unmodifiableSet(new HashSet(Arrays.asList("google.com", "facebook.com", "twitter.com", "github.com", "password", "phone", "anonymous", "emailLink")));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f8154d = Collections.unmodifiableSet(new HashSet(Arrays.asList("microsoft.com", "yahoo.com", "apple.com", "twitter.com", "github.com")));
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList("google.com", "facebook.com")));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IdentityHashMap f8155f = new IdentityHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f8156g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.g f8157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseAuth f8158b;

    public e(n9.g gVar) {
        this.f8157a = gVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVar);
        this.f8158b = firebaseAuth;
        try {
            firebaseAuth.e.zzA("8.0.2");
        } catch (Exception e4) {
            Log.e("AuthUI", "Couldn't set the FUI version.", e4);
        }
        FirebaseAuth firebaseAuth2 = this.f8158b;
        synchronized (firebaseAuth2.h) {
            firebaseAuth2.i = zzaeo.zza();
        }
    }

    public static e a(n9.g gVar) {
        e eVar;
        if (a5.e.f197b) {
            Log.w("AuthUI", "Beginning with FirebaseUI 6.2.0 you no longer need to include the TwitterKit SDK to sign in with Twitter. Go to https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0 for more information");
        }
        if (a5.e.f196a) {
            Log.w("AuthUI", "Beginning with FirebaseUI 6.2.0 you no longer need to include com.firebaseui:firebase-ui-auth-github to sign in with GitHub. Go to https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0 for more information");
        }
        IdentityHashMap identityHashMap = f8155f;
        synchronized (identityHashMap) {
            try {
                eVar = (e) identityHashMap.get(gVar);
                if (eVar == null) {
                    eVar = new e(gVar);
                    identityHashMap.put(gVar, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
