package a5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f197b;

    static {
        boolean z4;
        boolean z10 = false;
        try {
            Class.forName("com.firebase.ui.auth.data.remote.GitHubSignInHandler");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f196a = z4;
        try {
            Class.forName("com.facebook.login.LoginManager");
        } catch (ClassNotFoundException unused2) {
        }
        try {
            Class.forName("com.twitter.sdk.android.core.identity.TwitterAuthClient");
            z10 = true;
        } catch (ClassNotFoundException unused3) {
        }
        f197b = z10;
    }
}
