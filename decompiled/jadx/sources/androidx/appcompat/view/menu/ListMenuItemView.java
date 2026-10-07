package androidx.appcompat.view.menu;

import a2.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import f.a;
import java.util.WeakHashMap;
import k.n;
import k.z;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {
    public LayoutInflater A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f435d;
    public CheckBox e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f436f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Drawable f440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Drawable f444y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f445z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l lVarG = l.G(getContext(), attributeSet, a.f3566r, R.attr.listMenuViewStyle);
        this.f440u = lVarG.u(5);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        this.f441v = typedArray.getResourceId(1, -1);
        this.f443x = typedArray.getBoolean(7, false);
        this.f442w = context;
        this.f444y = lVarG.u(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f445z = typedArrayObtainStyledAttributes.hasValue(0);
        lVarG.I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.A == null) {
            this.A = LayoutInflater.from(getContext());
        }
        return this.A;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f437r;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f438s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f438s.getLayoutParams();
        rect.top = this.f438s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // k.z
    public final void c(n nVar) {
        boolean z4;
        int i;
        String string;
        boolean z10;
        this.f432a = nVar;
        boolean zIsVisible = nVar.isVisible();
        k.l lVar = nVar.f5890y;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(nVar.e);
        setCheckable(nVar.isCheckable());
        if (lVar.o()) {
            if ((lVar.n() ? nVar.f5886u : nVar.f5884s) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        lVar.n();
        if (z4) {
            n nVar2 = this.f432a;
            k.l lVar2 = nVar2.f5890y;
            if (lVar2.o()) {
                if ((lVar2.n() ? nVar2.f5886u : nVar2.f5884s) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            i = z10 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f436f;
            n nVar3 = this.f432a;
            k.l lVar3 = nVar3.f5890y;
            Context context = lVar3.f5861a;
            char c10 = lVar3.n() ? nVar3.f5886u : nVar3.f5884s;
            if (c10 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i10 = lVar3.n() ? nVar3.f5887v : nVar3.f5885t;
                n.c(i10, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                n.c(i10, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                n.c(i10, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                n.c(i10, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                n.c(i10, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                n.c(i10, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                if (c10 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb2.append(c10);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f436f.getVisibility() != i) {
            this.f436f.setVisibility(i);
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.B);
    }

    @Override // k.z
    public n getItemData() {
        return this.f432a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(this, this.f440u);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f435d = textView;
        int i = this.f441v;
        if (i != -1) {
            textView.setTextAppearance(this.f442w, i);
        }
        this.f436f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f437r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f444y);
        }
        this.f438s = (ImageView) findViewById(R.id.group_divider);
        this.f439t = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        if (this.f433b != null && this.f443x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f433b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i, i10);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f434c == null && this.e == null) {
            return;
        }
        if ((this.f432a.I & 4) != 0) {
            if (this.f434c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f434c = radioButton;
                LinearLayout linearLayout = this.f439t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f434c;
            view = this.e;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.f439t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            view = this.f434c;
        }
        if (z4) {
            compoundButton.setChecked(this.f432a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f434c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f432a.I & 4) != 0) {
            if (this.f434c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f434c = radioButton;
                LinearLayout linearLayout = this.f439t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f434c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.f439t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.B = z4;
        this.f443x = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f438s;
        if (imageView != null) {
            imageView.setVisibility((this.f445z || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        k.l lVar = this.f432a.f5890y;
        boolean z4 = this.B;
        if (z4 || this.f443x) {
            ImageView imageView = this.f433b;
            if (imageView == null && drawable == null && !this.f443x) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f433b = imageView2;
                LinearLayout linearLayout = this.f439t;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f443x) {
                this.f433b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f433b;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f433b.getVisibility() != 0) {
                this.f433b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f435d.getVisibility() != 8) {
                this.f435d.setVisibility(8);
            }
        } else {
            this.f435d.setText(charSequence);
            if (this.f435d.getVisibility() != 0) {
                this.f435d.setVisibility(0);
            }
        }
    }
}
