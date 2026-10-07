package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import app.namso_gen.spacehowen.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2427d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, int i) {
        this.f2427d = i;
        this.e = obj;
    }

    @Override // q0.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2427d) {
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f2490d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // q0.c
    public final void d(View view, r0.l lVar) {
        int i = this.f2427d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f7886a;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, lVar.f8119a);
                m mVar = (m) obj;
                lVar.l(mVar.f2442q0.getVisibility() == 0 ? mVar.v(R.string.mtrl_picker_toggle_to_year_selection) : mVar.v(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                lVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, lVar.f8119a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i10 = MaterialButtonToggleGroup.f2378v;
                int i11 = -1;
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                        if (materialButtonToggleGroup.getChildAt(i13) == view) {
                            i11 = i12;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                                i12++;
                            }
                        }
                    }
                }
                lVar.j(r0.k.a(0, 1, i11, 1, ((MaterialButton) view).f2377z));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = lVar.f8119a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f2490d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = lVar.f8119a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).I);
                break;
        }
    }

    @Override // q0.c
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f2427d) {
            case 1:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((d9.j) ((d9.h) this.e)).a(3);
                return true;
            default:
                return super.g(view, i, bundle);
        }
    }
}
