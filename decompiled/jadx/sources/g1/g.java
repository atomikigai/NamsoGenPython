package g1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f4173c;

    public g(TextView textView) {
        this.f4173c = new f(textView);
    }

    @Override // fa.c1
    public final void C(boolean z4) {
        if (l.f771j != null) {
            this.f4173c.C(z4);
        }
    }

    @Override // fa.c1
    public final void D(boolean z4) {
        f fVar = this.f4173c;
        if (l.f771j != null) {
            fVar.D(z4);
        } else {
            fVar.e = z4;
        }
    }

    @Override // fa.c1
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        return !(l.f771j != null) ? inputFilterArr : this.f4173c.u(inputFilterArr);
    }
}
