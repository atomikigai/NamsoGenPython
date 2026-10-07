package h3;

import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f4749b;

    public /* synthetic */ k0(e1 e1Var, int i) {
        this.f4748a = i;
        this.f4749b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4748a) {
            case 0:
                this.f4749b.e0();
                return;
            default:
                EditText editText = this.f4749b.f4667g0;
                if (editText != null) {
                    editText.setSelection(editText.getText().length());
                    return;
                } else {
                    jc.i.i("etResult");
                    throw null;
                }
        }
    }
}
