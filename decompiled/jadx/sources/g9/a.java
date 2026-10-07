package g9;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4319b;

    public /* synthetic */ a(Object obj, int i) {
        this.f4318a = i;
        this.f4319b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f4318a) {
            case 0:
                d dVar = (d) this.f4319b;
                dVar.s(dVar.t());
                return;
            case 1:
                l lVar = (l) this.f4319b;
                lVar.f4342l = z4;
                lVar.p();
                if (z4) {
                    return;
                }
                lVar.s(false);
                lVar.f4343m = false;
                return;
            default:
                h3.v vVar = (h3.v) this.f4319b;
                if (z4) {
                    return;
                }
                EditText editText = vVar.f4862f0;
                if (editText != null) {
                    vVar.d0(editText.getText().toString());
                    return;
                } else {
                    jc.i.i("inputBinEditText");
                    throw null;
                }
        }
    }
}
