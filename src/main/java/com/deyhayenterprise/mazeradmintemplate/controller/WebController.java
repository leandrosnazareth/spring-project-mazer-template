package com.deyhayenterprise.mazeradmintemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class WebController {

    @GetMapping(value = { "/", "/index", "/index.html" })
	public String indexMain(Model model) {
		log.info("web controller class paramaters as model");
		model.addAttribute("activeMenu", "dashboard");

        return "index";
    }    	

	@GetMapping("/application-chat")
	public String applicationChat() {
		return "application-chat";
	}

	@GetMapping("/application-checkout")
	public String applicationCheckout() {
		return "application-checkout";
	}

	@GetMapping("/application-email")
	public String applicationEmail() {
		return "application-email";
	}

	@GetMapping("/application-gallery")
	public String applicationGallery() {
		return "application-gallery";
	}

	@GetMapping("/error-403")
	public String error403() {
		return "error-403";
	}	

	@GetMapping("/error-404")
	public String error404() {
		return "error-404";
	}

	@GetMapping("/error-500")
	public String error500() {
		return "error-500";
	}

	@GetMapping("/auth-login")
	public String authLogin() {
		return "auth-login";
	}

	@GetMapping("/auth-register")
	public String authRegister() {
		return "auth-register";
	}

	@GetMapping("/auth-forgot-password")
	public String authForgotPassword() {
		return "auth-forgot-password";
	}

	@GetMapping("/component-accordion")
	public String componentAccordion(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "accordion");
		return "component-accordion";
	}

	@GetMapping("/component-alert")
	public String componentAlert(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "alert");
		return "component-alert";
	}

	@GetMapping("/component-badge")
	public String componentBadge(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "badge");
		return "component-badge";
	}

	@GetMapping("/component-breadcrumb")
	public String componentBreadcrumb(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "breadcrumb");
		return "component-breadcrumb";
	}

	@GetMapping("/component-button")
	public String componentButton(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "button");
		return "component-button";
	}

	@GetMapping("/component-card")
	public String componentCard(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "card");
		return "component-card";
	}

	@GetMapping("/component-carousel")
	public String componentCarousel(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "carousel");
		return "component-carousel";
	}

	@GetMapping("/component-collapse")
	public String componentCollapse(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "collapse");
		return "component-collapse";
	}

	@GetMapping("/component-dropdown")
	public String componentDropdown(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "dropdown");
		return "component-dropdown";
	}

	@GetMapping("/component-list-group")
	public String componentListGroup(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "list-group");
		return "component-list-group";
	}

	@GetMapping("/component-modal")
	public String componentModal(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "modal");
		return "component-modal";
	}

	@GetMapping("/component-navs")
	public String componentNavs(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "navs");
		return "component-navs";
	}

	@GetMapping("/component-pagination")
	public String componentPagination(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "pagination");
		return "component-pagination";
	}

	@GetMapping("/component-progress")
	public String componentProgress(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "alert");
		return "component-progress";
	}

	@GetMapping("/component-spinner")
	public String componentSpinner(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "spinner");
		return "component-spinner";
	}

	@GetMapping("/component-toasts")
	public String componentToasts(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "toasts");
		return "component-toasts";
	}

	@GetMapping("/component-tooltip")
	public String componentTooltip(Model model) {
		model.addAttribute("activeMenu", "components");
		model.addAttribute("activeItem", "tooltip");
		return "component-tooltip";
	}

	@GetMapping("/extra-component-avatar")
	public String extraComponentAvatar(Model model) {
		model.addAttribute("activeMenu", "extra");
		model.addAttribute("activeItem", "avatar");
		return "extra-component-avatar";
	}

	@GetMapping("/extra-component-date-picker")
	public String extraComponentDatePicker(Model model) {
		model.addAttribute("activeMenu", "extra");
		model.addAttribute("activeItem", "date-picker");
		return "extra-component-date-picker";
	}

	@GetMapping("/extra-component-divider")
	public String extraComponentDivider(Model model) {
		model.addAttribute("activeMenu", "extra");
		model.addAttribute("activeItem", "divider");
		return "extra-component-divider";
	}

	@GetMapping("/extra-component-rating")
	public String extraComponentRating(Model model) {
		model.addAttribute("activeMenu", "extra");
		model.addAttribute("activeItem", "rating");
		return "extra-component-rating";
	}

	@GetMapping("/extra-component-sweetalert")
	public String extraComponentSweetalert(Model model) {
		model.addAttribute("activeMenu", "extra");
		model.addAttribute("activeItem", "sweetalert");
		return "extra-component-sweetalert";
	}

	@GetMapping("/extra-component-toastify")
	public String extraComponentToastify(Model model) {
		model.addAttribute("activeMenu", "extra");
		model.addAttribute("activeItem", "toastify");
		return "extra-component-toastify";
	}

	@GetMapping("/layout-default")
	public String layoutDefault(Model model) {
		model.addAttribute("activeMenu", "layout");
		model.addAttribute("activeItem", "default");
		return "layout-default";
	}

	@GetMapping("/layout-horizontal")
	public String layoutHorizontal(Model model) {
		model.addAttribute("activeMenu", "layout");
		model.addAttribute("activeItem", "horizontal");
		return "layout-horizontal";
	}

	@GetMapping("/layout-rtl")
	public String layoutRtl(Model model) {
		model.addAttribute("activeMenu", "layout");
		model.addAttribute("activeItem", "rtl");
		return "layout-rtl";
	}

	@GetMapping("/layout-rtl-backup")
	public String layoutRtlBackup(Model model) {
		model.addAttribute("activeMenu", "layout");
		model.addAttribute("activeItem", "rtl");
		return "layout-rtl-backup";
	}

	@GetMapping("/layout-vertical-1-column")
	public String layoutVertical1Column(Model model) {
		model.addAttribute("activeMenu", "layout");
		model.addAttribute("activeItem", "vertical-1-column");
		return "layout-vertical-1-column";
	}

	@GetMapping("/layout-vertical-navbar")
	public String layoutVerticalNavbar(Model model) {
		model.addAttribute("activeMenu", "layout");
		model.addAttribute("activeItem", "default");
		return "layout-vertical-navbar";
	}

	@GetMapping("/form-editor-ckeditor")
	public String formEditorCkeditor() {
		return "form-editor-ckeditor";
	}

	@GetMapping("/form-editor-quill")
	public String formEditorQuill() {
		return "form-editor-quill";
	}

	@GetMapping("/form-editor-summernote")
	public String formEditorSummernote() {
		return "form-editor-summernote";
	}

	@GetMapping("/form-editor-tinymce")
	public String formEditorTinymce() {
		return "form-editor-tinymce";
	}

	@GetMapping("/form-element-checkbox")
	public String formElementCheckbox() {
		return "form-element-checkbox";
	}

	@GetMapping("/form-element-input-group")
	public String formElementInputGroup() {
		return "form-element-input-group";
	}

	@GetMapping("/form-element-input")
	public String formElementInput() {
		return "form-element-input";
	}

	@GetMapping("/form-element-radio")
	public String formElementRadio() {
		return "form-element-radio";
	}

	@GetMapping("/form-element-select")
	public String formElementSelect() {
		return "form-element-select";
	}

	@GetMapping("/form-element-textarea")
	public String formElementTextarea() {
		return "form-element-textarea";
	}

	@GetMapping("/form-layout")
	public String formLayout() {
		return "form-layout";
	}

	@GetMapping("/form-validation-parsley")
	public String formValidationParsley() {
		return "form-validation-parsley";
	}

	@GetMapping("/table")
	public String table() {
		return "table";
	}

	@GetMapping("/table-datatable")
	public String tableDatatable() {
		return "table-datatable";
	}

	@GetMapping("/table-datatable-jquery")
	public String tableDatatableJquery() {
		return "table-datatable-jquery";
	}

	@GetMapping("/ui-chart-apexcharts")
	public String uiChartApexcharts() {
		return "ui-chart-apexcharts";
	}

	@GetMapping("/ui-chart-chartjs")
	public String uiChartChartjs() {
		return "ui-chart-chartjs";
	}

	@GetMapping("/ui-file-uploader")
	public String uiFileUploader() {
		return "ui-file-uploader";
	}

	@GetMapping("/ui-icons-bootstrap-icons")
	public String uiIconsBootstrapIcons() {
		return "ui-icons-bootstrap-icons";
	}

	@GetMapping("/ui-icons-dripicons")
	public String uiIconsDripicons() {
		return "ui-icons-dripicons";
	}

	@GetMapping("/ui-icons-fontawesome")
	public String uiIconsFontawesome() {
		return "ui-icons-fontawesome";
	}

	@GetMapping("/ui-map-google-map")
	public String uiMapGoogleMap() {
		return "ui-map-google-map";
	}

	@GetMapping("/ui-map-jsvectormap")
	public String uiMapJsvectormap() {
		return "ui-map-jsvectormap";
	}

	@GetMapping("/ui-multi-level-menu")
	public String uiMultiLevelMenu() {
		return "ui-multi-level-menu";
	}

	@GetMapping("/ui-widgets-chatbox")
	public String uiWidgetsChatbox() {
		return "ui-widgets-chatbox";
	}

	@GetMapping("/ui-widgets-pricing")
	public String uiWidgetsPricing() {
		return "ui-widgets-pricing";
	}

	@GetMapping("/ui-widgets-todolist")
	public String uiWidgetsTodolist() {
		return "ui-widgets-todolist";
	}
    
}
