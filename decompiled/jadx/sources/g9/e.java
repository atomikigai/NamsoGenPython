package g9;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i) {
        super(pVar);
        this.e = i;
    }

    @Override // g9.q
    public void q() {
        switch (this.e) {
            case 0:
                p pVar = this.f4370b;
                pVar.f4368z = null;
                CheckableImageButton checkableImageButton = pVar.f4360r;
                checkableImageButton.setOnLongClickListener(null);
                p3.a.r(checkableImageButton, null);
                break;
        }
    }
}
