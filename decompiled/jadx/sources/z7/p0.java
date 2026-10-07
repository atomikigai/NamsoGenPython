package z7;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11296d;
    public final /* synthetic */ q0 e;

    public p0(q0 q0Var, String str, long j4) {
        this.e = q0Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f11293a = str;
        this.f11294b = j4;
    }

    public final long a() {
        if (!this.f11295c) {
            this.f11295c = true;
            this.f11296d = this.e.g().getLong(this.f11293a, this.f11294b);
        }
        return this.f11296d;
    }

    public final void b(long j4) {
        SharedPreferences.Editor editorEdit = this.e.g().edit();
        editorEdit.putLong(this.f11293a, j4);
        editorEdit.apply();
        this.f11296d = j4;
    }
}
