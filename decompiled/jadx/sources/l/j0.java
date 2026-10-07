package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements o0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g.f f6319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f6320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f6321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f6322d;

    public j0(p0 p0Var) {
        this.f6322d = p0Var;
    }

    @Override // l.o0
    public final boolean a() {
        g.f fVar = this.f6319a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // l.o0
    public final int b() {
        return 0;
    }

    @Override // l.o0
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.o0
    public final CharSequence d() {
        return this.f6321c;
    }

    @Override // l.o0
    public final void dismiss() {
        g.f fVar = this.f6319a;
        if (fVar != null) {
            fVar.dismiss();
            this.f6319a = null;
        }
    }

    @Override // l.o0
    public final Drawable e() {
        return null;
    }

    @Override // l.o0
    public final void f(CharSequence charSequence) {
        this.f6321c = charSequence;
    }

    @Override // l.o0
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.o0
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.o0
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // l.o0
    public final void n(int i, int i10) {
        if (this.f6320b == null) {
            return;
        }
        p0 p0Var = this.f6322d;
        ea.j jVar = new ea.j(p0Var.getPopupContext());
        g.b bVar = (g.b) jVar.f3530b;
        CharSequence charSequence = this.f6321c;
        if (charSequence != null) {
            bVar.f3971d = charSequence;
        }
        k0 k0Var = this.f6320b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f3981q = k0Var;
        bVar.f3982r = this;
        bVar.f3985u = selectedItemPosition;
        bVar.f3984t = true;
        g.f fVarA = jVar.a();
        this.f6319a = fVarA;
        AlertController$RecycleListView alertController$RecycleListView = fVarA.f4019f.f3997f;
        h0.d(alertController$RecycleListView, i);
        h0.c(alertController$RecycleListView, i10);
        this.f6319a.show();
    }

    @Override // l.o0
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        p0 p0Var = this.f6322d;
        p0Var.setSelection(i);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i, this.f6320b.getItemId(i));
        }
        dismiss();
    }

    @Override // l.o0
    public final void p(ListAdapter listAdapter) {
        this.f6320b = (k0) listAdapter;
    }
}
