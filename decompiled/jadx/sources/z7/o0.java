package z7;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11288d;
    public final /* synthetic */ q0 e;

    public o0(q0 q0Var, String str, boolean z4) {
        this.e = q0Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f11285a = str;
        this.f11286b = z4;
    }

    public final void a(boolean z4) {
        SharedPreferences.Editor editorEdit = this.e.g().edit();
        editorEdit.putBoolean(this.f11285a, z4);
        editorEdit.apply();
        this.f11288d = z4;
    }

    public final boolean b() {
        if (!this.f11287c) {
            this.f11287c = true;
            this.f11288d = this.e.g().getBoolean(this.f11285a, this.f11286b);
        }
        return this.f11288d;
    }
}
