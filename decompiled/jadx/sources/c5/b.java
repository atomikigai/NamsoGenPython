package c5;

import android.util.Patterns;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TextInputLayout textInputLayout, int i) {
        super(textInputLayout);
        this.f1777d = i;
    }

    @Override // c5.a
    public final boolean e(CharSequence charSequence) {
        switch (this.f1777d) {
            case 0:
                return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
            case 1:
                return true;
            default:
                return charSequence != null && charSequence.length() > 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f1777d = 0;
        this.f1775b = textInputLayout.getResources().getString(R.string.fui_invalid_email_address);
        this.f1776c = textInputLayout.getResources().getString(R.string.fui_missing_email_address);
    }
}
