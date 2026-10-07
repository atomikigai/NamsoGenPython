package sb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import jd.l;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f8471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f8472d;
    public GradientDrawable e;

    public d(Context context) {
        super(context, null);
        this.f8470b = new i(new c(this, 2));
        this.f8471c = new i(new c(this, 1));
        this.f8472d = new i(new c(this, 0));
        View.inflate(getContext(), R.layout.cnb_horizontal_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    }

    private final View getContainer() {
        return (View) this.f8472d.getValue();
    }

    private final BadgeImageView getIcon() {
        return (BadgeImageView) this.f8471c.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.f8470b.getValue();
    }

    @Override // sb.e
    public final void a(qb.a aVar) {
        jc.i.e(aVar, "item");
        int i = aVar.h;
        CharSequence charSequence = aVar.f8046b;
        qb.b bVar = aVar.f8051j;
        setId(aVar.f8045a);
        setImportantForAccessibility(1);
        CharSequence charSequence2 = aVar.f8047c;
        if (charSequence2 == null) {
            charSequence2 = charSequence;
        }
        setContentDescription(charSequence2);
        setEnabled(aVar.e);
        Integer num = bVar.f8054c;
        float f10 = bVar.f8055d;
        int i10 = bVar.e;
        int i11 = bVar.f8053b;
        if (num != null) {
            TextView title = getTitle();
            jc.i.d(title, "title");
            title.setTextAppearance(num.intValue());
        }
        getTitle().setText(charSequence);
        getTitle().setTextColor(i);
        TextView title2 = getTitle();
        jc.i.d(title2, "title");
        n9.b.B(title2, i, i11);
        getIcon().getLayoutParams().width = i10;
        getIcon().getLayoutParams().height = i10;
        getIcon().setImageResource(aVar.f8048d);
        getIcon().setBadgeColor(bVar.f8052a);
        BadgeImageView icon = getIcon();
        jc.i.d(icon, "icon");
        l.v(icon, aVar.f8050g, i11, aVar.f8049f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setTint(aVar.i);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setTint(-16777216);
        this.e = gradientDrawable2;
        View container = getContainer();
        jc.i.d(container, "container");
        GradientDrawable gradientDrawable3 = this.e;
        if (gradientDrawable3 != null) {
            qd.b.B(container, gradientDrawable, gradientDrawable3);
        } else {
            jc.i.i("mask");
            throw null;
        }
    }

    @Override // sb.e
    public final void b(int i) {
        getIcon().c(i);
    }

    @Override // sb.e, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4 || !isSelected()) {
            return;
        }
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        super.setSelected(z4);
        if (!z4) {
            getTitle().setVisibility(8);
            return;
        }
        getContainer().setVisibility(8);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable == null) {
            jc.i.i("mask");
            throw null;
        }
        gradientDrawable.jumpToCurrentState();
        getContainer().setVisibility(0);
        getTitle().setVisibility(0);
    }
}
