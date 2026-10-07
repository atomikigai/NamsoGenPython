package n8;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import app.namso_gen.spacehowen.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import r0.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends y0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f7319q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f7319q = chip;
    }

    @Override // y0.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.I;
        Chip chip = this.f7319q;
        if (!chip.c() || (eVar = chip.e) == null || !eVar.V || chip.f2392s == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // y0.b
    public final void o(int i, l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.I);
            return;
        }
        Chip chip = this.f7319q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        lVar.b(r0.f.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
