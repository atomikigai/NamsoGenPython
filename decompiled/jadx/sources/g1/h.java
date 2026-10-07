package g1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4174a;

    public h(EditText editText) {
        this.f4174a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        i.a((EditText) this.f4174a.get(), 1);
    }
}
