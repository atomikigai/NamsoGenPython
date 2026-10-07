package y0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import r0.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f10360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(27);
        this.f10360c = bVar;
    }

    @Override // a4.b
    public final l k(int i) {
        return new l(AccessibilityNodeInfo.obtain(this.f10360c.n(i).f8119a));
    }

    @Override // a4.b
    public final l l(int i) {
        b bVar = this.f10360c;
        int i10 = i == 2 ? bVar.f10368k : bVar.f10369l;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return k(i10);
    }

    @Override // a4.b
    public final boolean p(int i, int i10, Bundle bundle) {
        int i11;
        b bVar = this.f10360c;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = v0.f7946a;
            return d0.j(chip, i10, bundle);
        }
        if (i10 == 1) {
            return bVar.p(i);
        }
        if (i10 == 2) {
            return bVar.j(i);
        }
        boolean z4 = false;
        if (i10 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i11 = bVar.f10368k) == i) {
                return false;
            }
            if (i11 != Integer.MIN_VALUE) {
                bVar.f10368k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i11, 65536);
            }
            bVar.f10368k = i;
            chip.invalidate();
            bVar.q(i, 32768);
            return true;
        }
        if (i10 == 128) {
            if (bVar.f10368k != i) {
                return false;
            }
            bVar.f10368k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i, 65536);
            return true;
        }
        Chip chip2 = ((n8.c) bVar).f7319q;
        if (i10 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2392s;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z4 = true;
                }
                if (chip2.E) {
                    chip2.D.q(1, 1);
                }
            }
        }
        return z4;
    }
}
