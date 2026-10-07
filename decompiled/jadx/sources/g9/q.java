package g9;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f4372d;

    public q(p pVar) {
        this.f4369a = pVar.f4355a;
        this.f4370b = pVar;
        this.f4371c = pVar.getContext();
        this.f4372d = pVar.f4360r;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public r0.d h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof l;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f4370b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(r0.l lVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z4) {
    }
}
