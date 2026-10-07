package n8;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import u8.k;
import u8.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7317b;

    public /* synthetic */ a(Object obj, int i) {
        this.f7316a = i;
        this.f7317b = obj;
    }

    @Override // com.bumptech.glide.c
    public final void A(Typeface typeface, boolean z4) {
        switch (this.f7316a) {
            case 0:
                Chip chip = (Chip) this.f7317b;
                e eVar = chip.e;
                chip.setText(eVar.N0 ? eVar.P : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z4) {
                    l lVar = (l) this.f7317b;
                    lVar.e = true;
                    k kVar = (k) lVar.f9038f.get();
                    if (kVar != null) {
                        kVar.a();
                    }
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.c
    public final void z(int i) {
        switch (this.f7316a) {
            case 0:
                break;
            default:
                l lVar = (l) this.f7317b;
                lVar.e = true;
                k kVar = (k) lVar.f9038f.get();
                if (kVar != null) {
                    kVar.a();
                }
                break;
        }
    }

    private final void V(int i) {
    }
}
