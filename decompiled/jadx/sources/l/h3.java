package l;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f6290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f6291b;

    public h3(i3 i3Var) {
        this.f6291b = i3Var;
        Context context = i3Var.f6293a.getContext();
        CharSequence charSequence = i3Var.h;
        k.a aVar = new k.a();
        aVar.e = 4096;
        aVar.f5806r = 4096;
        aVar.f5811w = null;
        aVar.f5812x = null;
        aVar.f5813y = false;
        aVar.f5814z = false;
        aVar.A = 16;
        aVar.f5808t = context;
        aVar.f5801a = charSequence;
        this.f6290a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i3 i3Var = this.f6291b;
        Window.Callback callback = i3Var.f6300k;
        if (callback == null || !i3Var.f6301l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f6290a);
    }
}
