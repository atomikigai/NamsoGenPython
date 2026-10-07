package g9;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends u8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4349a;

    public m(p pVar) {
        this.f4349a = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f4349a.b().a();
    }

    @Override // u8.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        this.f4349a.b().b();
    }
}
