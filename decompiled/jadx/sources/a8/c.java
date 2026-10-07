package a8;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f246b;

    static {
        h hVar = new h();
        b bVar = new b(0);
        f245a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f246b = new i("SignIn.API", bVar, hVar);
    }
}
