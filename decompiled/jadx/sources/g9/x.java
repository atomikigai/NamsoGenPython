package g9;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends q {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f4413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f4414g;

    public x(p pVar, int i) {
        super(pVar);
        this.e = R.drawable.design_password_eye;
        this.f4414g = new com.google.android.material.datepicker.n(this, 3);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // g9.q
    public final void b() {
        p();
    }

    @Override // g9.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // g9.q
    public final int d() {
        return this.e;
    }

    @Override // g9.q
    public final View.OnClickListener f() {
        return this.f4414g;
    }

    @Override // g9.q
    public final boolean j() {
        return true;
    }

    @Override // g9.q
    public final boolean k() {
        EditText editText = this.f4413f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // g9.q
    public final void l(EditText editText) {
        this.f4413f = editText;
        p();
    }

    @Override // g9.q
    public final void q() {
        EditText editText = this.f4413f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f4413f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // g9.q
    public final void r() {
        EditText editText = this.f4413f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
