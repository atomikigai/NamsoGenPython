package l;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q0.f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f6228c;

    public a(FloatingActionButton floatingActionButton) {
        this.f6226a = false;
        this.f6227b = 0;
        this.f6228c = floatingActionButton;
    }

    @Override // q0.f1
    public void a(View view) {
        this.f6226a = true;
    }

    @Override // q0.f1
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f6226a = false;
    }

    @Override // q0.f1
    public void c() {
        if (this.f6226a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f6228c;
        actionBarContextView.f458f = null;
        super/*android.view.View*/.setVisibility(this.f6227b);
    }

    public a(ActionBarContextView actionBarContextView) {
        this.f6228c = actionBarContextView;
        this.f6226a = false;
    }
}
